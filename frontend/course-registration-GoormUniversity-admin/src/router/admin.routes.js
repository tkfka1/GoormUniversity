import { Layout, List, AddEdit } from '@/views/admin';

export default {
    path: '/admin',
    component: Layout,
    children: [
        { path: '', component: List },
        { path: 'add', component: AddEdit },
        { path: 'edit/:id', component: AddEdit }
    ]
};
