# Aihe: SuomiTetris

**Kuvaus:** Toteutetaan tavallinen Tetrispeli jossa on teemana Suomi. Teeman voisi sisällyttää peliin mm. sinivalkoisia palikoita
tai lisäämällä taustamusiikiksi jotain suomalaista musiikkia. Muuten peli on perinteinen Tetris. Peli tulee sisältämään Highscore -taulukon 
johon pelaaja voi päästä saamalla tarpeeksi hyvät pisteet.

**Käyttäjät:**
Pelaaja

**Kaikkien käyttäjien toiminnot:**
- pelin aloittaminen
- pelin lopettaminen
- highscore -taulukon katsominen
- nimimerkin lisääminen highscore -taulukkoon
 * onnistuu jos käyttäjä on saanut pisteitä tarpeeksi
 
**Rakennekuvaus**

Ohjelma koostuu tällä hetkellä kahdeksasta eri luokasta joista tärkeimpiä pelin logiikan kannalta ovat GameBoard ja Block. Nämä luokat hoitavat tetrominopalikoiden siirtämisen ja kääntämisen. Piirtopuolesta vastaa GamePanel luokka ja näppäinkomennoista ButtonListener -luokka. Tetrominoes -luokka sisältää kaikkien seitsemän tetrominopalikan koordinaatit joita Block -luokka hyödyntää.
 
**Luokkakaavio**

![Luokkakaavio](/Documentation/classdiagram.png)


**Sekvenssikaaviot**

Pelin luominen

![Pelinluonti](/Documentation/pelinluonti.png)

Palikan siirtäminen vasemmalle ja oikealle

![Palikansiirto](/Documentation/liikuttaminen.png)

Palikan kääntäminen vasemmalle ja oikealle

![Palikankääntö](/Documentation/kääntäminen.png)
