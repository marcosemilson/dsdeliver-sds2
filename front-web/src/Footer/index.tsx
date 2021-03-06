import './styles.css';
import {ReactComponent as YoutubeIcon} from './youtube.svg';
import {ReactComponent as LinkedinIcon} from './linkedin.svg';
import {ReactComponent as InstagramIcon} from './instagram.svg';
function Footer(){
    return(
        <footer className="main-footer">
            App desenvolvida durante a segunda edição do evento DevSuperior<br />
            Desenvolvida por Marcos Pereira sob orientação dos mestres: Washington Soares e Nélio Alves
            <div className="footer-icons">
                <a href="https://youtube.com/c/DevSuperior" target="_new">
                    <YoutubeIcon />
                </a>
                <a href="https://www.linkedin.com/school/devsuperior" target="_new">
                    <LinkedinIcon />
                </a>
                <a href="https://www.instagram.com/devsuperior.ig" target="_new">
                    <InstagramIcon />
                </a>
            </div>
        </footer>
    )
}

export default Footer