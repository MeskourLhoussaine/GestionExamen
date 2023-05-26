import { useRef } from "react";
import { FaBars, FaTimes } from "react-icons/fa";
import "../style/nav.css";
import { NavLink } from "react-router-dom";

import Nav from 'react-bootstrap/Nav';

import Dropdown from 'react-bootstrap/Dropdown';
import DropdownButton from 'react-bootstrap/DropdownButton';

function Navbar() {
	const navRef = useRef();

	const showNavbar = () => {
		navRef.current.classList.toggle(
			"responsive_nav"
		);
	};

	return (
		<header>
			<h3></h3>
		
            <Nav  ref={navRef} variant="tabs" defaultActiveKey="/home" className="navbar navbar-expand-lg navbar-light bg-danger" >
        <Nav.Item >
        <a className="nav-link" to="/" activeClassName="active" style={{color:"#000000"}}>
                Home
              </a>
        </Nav.Item>
        <Nav.Item>
        <a className="nav-link" to="/ville" activeClassName="active" style={{color:"#000000",backgroundColor:"#dc3545"}}>
                Ville
              </a>
        </Nav.Item>
        <Nav.Item>
        <a className="nav-link" to="/zone" activeClassName="active" style={{color:"#000000",backgroundColor:" #dc3545"}}>
                Zone
              </a>
        </Nav.Item>

        <Nav.Item>
        <a className="nav-link" to="/zoneByVille" activeClassName="active" style={{color:"#000000",backgroundColor:"#dc3545"}}>
                ZonByville
              </a>
        </Nav.Item>

        <Nav.Item>
        <a className="nav-link" to="/restaurant" activeClassName="active" style={{color:"#000000",backgroundColor:"#dc3545"}}>
                Restaurant
              </a>
        </Nav.Item>
     <Nav.Item>
     <a className="nav-link" to="/serie" activeClassName="active" style={{color:"#000000",backgroundColor:"#dc3545"}} >
                Serie
              </a>
     </Nav.Item>
     <Nav.Item>
     <a className="nav-link" to="/specialite" activeClassName="active" style={{color:"#000000" , backgroundColor:"#dc3545"}}>
                Specialite
              </a>
     </Nav.Item>
     
     <DropdownButton id="dropdown-basic-button" title="Dropdown button" variant="secondary" style={{paddingLeft:"530px"}}>
      <Dropdown.Item href="#/action-1" style={{backgroundColor:"#cc5233"}}>Map</Dropdown.Item>
      <Dropdown.Item href="/zoneByVille" style={{backgroundColor:"#bf4c40"}}>Zone Par Ville</Dropdown.Item>
      <Dropdown.Item href="/RestaurantByZoneV" style={{backgroundColor:"#b2474c"}}> Restaurant par Zone et Ville</Dropdown.Item>
    </DropdownButton>

    
  
   
    
				<button
					className="nav-btn nav-close-btn"
					onClick={showNavbar}>
					<FaTimes />
				</button>
	</Nav>
			<button
				className="nav-btn"
				onClick={showNavbar}>
				<FaBars />
			</button>
		</header>
	);
}

export default Navbar;