package com.spring.api.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1526004179L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUser user = new QUser("user");

    public final ListPath<CartLecture, QCartLecture> CartLectures = this.<CartLecture, QCartLecture>createList("CartLectures", CartLecture.class, QCartLecture.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> createdDate = createDateTime("createdDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> credit = createNumber("credit", Long.class);

    public final StringPath email = createString("email");

    public final NumberPath<Long> grade = createNumber("grade", Long.class);

    public final NumberPath<Long> haveCredit = createNumber("haveCredit", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMajor major;

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final ListPath<SessionUser, QSessionUser> sessions = this.<SessionUser, QSessionUser>createList("sessions", SessionUser.class, QSessionUser.class, PathInits.DIRECT2);

    public final StringPath studentId = createString("studentId");

    public final ListPath<TakeLecture, QTakeLecture> TakeLectures = this.<TakeLecture, QTakeLecture>createList("TakeLectures", TakeLecture.class, QTakeLecture.class, PathInits.DIRECT2);

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    public QUser(Path<? extends User> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUser(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUser(PathMetadata metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.major = inits.isInitialized("major") ? new QMajor(forProperty("major")) : null;
    }

}

