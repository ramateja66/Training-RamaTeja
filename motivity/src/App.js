import logo from './logo.svg';
import './App.css';
import Navbar from './components/navbar'; 
import {BrowserRouter ,Switch,Route} from 'react-router-dom';
import Form from './components/form';
import Display from './components/display';

function App() {
  return (
    <BrowserRouter>
    <div className="App">
      
      <div>
      
      <Navbar></Navbar>
      <Route path="/form" component={Form} />
     <Route exact path="/" component={Home} />
     <Route exact path="/display" component={Display} />
      </div>
      
    </div>
    </BrowserRouter>
  );
}
const Home=()=>
{
  return(
  <div>
    <h1>Home</h1>
  </div>
  )
}

export default App;
