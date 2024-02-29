import { Navbar } from "@nextui-org/navbar";
import React from "react";
import { Button } from "@nextui-org/react";

{/* class name se uso para aplicar cc */}

export default function Page() {
    return (
        <div className="">  
        <Navbar>  
           <h1> hello page</h1> 
                <Button color="warning">
                    Button
                </Button>
        </Navbar>
         
        
        </div>
    )

    
}