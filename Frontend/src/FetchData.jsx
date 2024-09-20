import { useState } from 'react'


function FetchData() {

    const [data, setData] = useState(null);
    const randomNumber = Math.floor(Math.random() * 600) + 1;
    const getData = async () => {
            try{
            const response = await fetch('https://api.pokemontcg.io/v2/cards/');
            const {data} = await response.json();
            
            // const randomData = data[randomNumber];
            Object.keys(data).forEach(key => {
                const newData = data[key];
                console.log(newData);
                
            });

        } catch (error) {

            console.log(error);
        }
    }

    
    // console.log(randomPoke);

    getData();
    return (
        <div>
            <h1>{ data ? data: "No pokemon"}</h1>
            <button onClick={getData}>Fetch Pokemon</button>
        </div>
  )
}

export default FetchData