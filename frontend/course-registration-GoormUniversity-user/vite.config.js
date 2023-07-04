import { fileURLToPath, URL } from 'url';

import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';

// https://vitejs.dev/config/
export default defineConfig({
    plugins: [vue()],
    resolve: {
        alias: {
            '@': fileURLToPath(new URL('./src', import.meta.url))
        }
    },
    server:{
      proxy:{
        "/api":{ 
          target: "http://localhost:8080/api/",
          rewrite: (path)=>path.replace(/^\/api/,""),
        },
        "/mlapp":{ 
          target: "http://127.0.0.1:5000/mlapp/",
          rewrite: (path)=>path.replace(/^\/mlapp/,""),
        },
      }
    }
});
