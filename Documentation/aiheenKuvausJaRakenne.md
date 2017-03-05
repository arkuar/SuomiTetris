# Aihe: SuomiTetris

**Kuvaus:** Toteutetaan tavallinen Tetrispeli jossa on teemana Suomi. Teeman voisi toteuttaa käyttämällä vain sinivalkoisia palikoita
tai lisäämällä taustamusiikiksi jotain suomalaista musiikkia. Muuten peli on perinteinen Tetris. 

**Käyttäjät:**
Pelaaja

**Kaikkien käyttäjien toiminnot:**
- pelin aloittaminen
- pelin pelaaminen
- pelin lopettaminen
 
**Rakennekuvaus**

Ohjelma koostuu tällä hetkellä yhdeksästä eri luokasta joista tärkeimpiä pelin logiikan kannalta ovat GameBoard ja Block. Nämä luokat hoitavat tetrominopalikoiden siirtämisen ja kääntämisen. Piirtopuolesta vastaa GamePanel luokka ja näppäinkomennoista ButtonListener -luokka. Tetrominoes -luokka sisältää kaikkien seitsemän tetrominopalikan koordinaatit joita Block -luokka hyödyntää. GameLoop -luokka vastaa pelin ajankulusta.
 
**Luokkakaavio**

![Luokkakaavio](/Documentation/classdiagram.png)


**Sekvenssikaaviot**

Pelin luominen

![Pelinluonti](/Documentation/pelinluonti.png)

Palikan siirtäminen vasemmalle ja oikealle

![Palikansiirto](/Documentation/liikuttaminen.png)

Palikan kääntäminen vasemmalle ja oikealle

![Palikankääntö](/Documentation/kääntäminen.png)
