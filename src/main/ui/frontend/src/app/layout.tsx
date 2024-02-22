// layout.tsx
import React from 'react';
import Head from 'next/head';

export default function RootLayout({ children }: { children: React.ReactNode; }) {
  return (
    <>
      <Head>
        <title>Mi Aplicación Next.js</title>
        {/* Aquí puedes añadir cualquier otro elemento global del head */}
      </Head>
      <div>
        {/* Componentes globales como la barra de navegación */}
        <main>{children}</main>
        {/* Componentes globales como el pie de página */}
      </div>
    </>
  );
}