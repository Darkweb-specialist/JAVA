import React, {useState} from 'react';
function ColorSelector(){
    const[selectedColor,setSelectedColor] = useState("");
    const handleColorSelect = (color) => {
        setSelectedColor(color);
    };
    return(
        <div>
            <h1>Select a Color:</h1>
            <button onClick={() => handleColorSelect('red')}>Red</button>
            <button onClick={() => handleColorSelect('Blue')}>Blue</button>
            <button onClick={() => handleColorSelect('Green')}>Green</button>
            <button onClick={() => handleColorSelect('Yellow')}>Yellow</button>
            {selectedColor && <p>You have Selected: {selectedColor}</p>}
        </div>
    );

}

export default ColorSelector;
