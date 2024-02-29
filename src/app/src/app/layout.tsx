"use client"
import { NextUIProvider } from '@nextui-org/react';



export default function RootLayout({
  children,
}: {
  children: React.ReactNode
}) {
  return (
    <NextUIProvider>
      {children}
    </NextUIProvider>
  );
}

