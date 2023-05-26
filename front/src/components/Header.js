
import React from "react";

import { NavLink } from "react-router-dom";
import Search from "./Search";
import Nav from 'react-bootstrap/Nav';
import NavDropdown from 'react-bootstrap/NavDropdown';

function Header() {
    return (
        <Nav variant="tabs" defaultActiveKey="/home" className="navbar navbar-expand-lg navbar-light bg-danger" >
        <Nav.Item >
        <NavLink className="nav-link" to="/" activeClassName="active" style={{color:"#000000"}}>
                Home
              </NavLink>
        </Nav.Item>
        <Nav.Item>
        <NavLink className="nav-link" to="/ville" activeClassName="active" style={{color:"#000000"}}>
                Ville
              </NavLink>
        </Nav.Item>
        <Nav.Item>
        <NavLink className="nav-link" to="/zone" activeClassName="active" style={{color:"#000000"}}>
                Zone
              </NavLink>
        </Nav.Item>

        <Nav.Item>
        <NavLink className="nav-link" to="/zoneByVille" activeClassName="active" style={{color:"#000000"}}>
                Zone par ville
              </NavLink>
        </Nav.Item>

        <Nav.Item>
        <NavLink className="nav-link" to="/restaurant" activeClassName="active" style={{color:"#000000"}}>
                Restaurant
              </NavLink>
        </Nav.Item>
     <Nav.Item>
     <NavLink className="nav-link" to="/serie" activeClassName="active" style={{color:"#000000"}}>
                Serie
              </NavLink>
     </Nav.Item>
     <Nav.Item>
     <NavLink className="nav-link" to="/specialite" activeClassName="active" style={{color:"#000000"}}>
                Specialite
              </NavLink>
     </Nav.Item>
     
     <NavDropdown title="Recherche"  id="navbarScrollingDropdown" style={{paddingLeft:"600px" }}>
    <NavDropdown.Item href="/zoneByVille" className="nav-link" to="/specialite" activeClassName="active">Zone Par Ville</NavDropdown.Item>
    <NavDropdown.Item href="/RestaurantByZoneV">
    Restaurant par Zone et Ville
    </NavDropdown.Item>
    <NavDropdown.Divider />
    <NavDropdown.Item href="#action5">
     Restaurant par Specialite
    </NavDropdown.Item>
  </NavDropdown>

      </Nav>
    );
  }
  export default Header;