import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { Header, Footer } from "./components/Layout";
import VilleList from "./components/VilleList";
import VilleForm from "./components/VilleForm";
import ZoneList from "./components/ZoneList";
import ZoneForm from "./components/ZoneForm";
import ZoneByVille from "./components/ZoneByVille";
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
    <Router>
      <Header />
      <div className="main-wrapper">
        <Routes>
          <Route path="/" element={<VilleList />} />
          <Route path="/ajouter-ville" element={<VilleForm />} />
          <Route path="/zone" element={<ZoneList/>} />
          <Route path="/ajouter-zone" element={<ZoneForm />} />
          <Route path="/zoneByVille" element={<ZoneByVille />} />
        </Routes>
      </div>
      <Footer />
    </Router>
  );
}

export default App;
