# Integración Continua/Despliegue Continuo (CI/CD)
## Pipeline:

## Construcción Automática:


## Análisis Estático: 
Para el análisis estático del código fuente se usó la herramienta de software SonarQube y su aditivo SonarQube Scanner.

    stage('Análisis estático') {
      steps {
          echo 'SonarQube...'
          withSonarQubeEnv('SonarQube') {
              bat "C:\sonar-scanner-4.7.0.2747-windows\bin\sonar-scanner.bat"
          }
      }
    }
    
    
![](Images/i1.jpeg)



## Pruebas Unitarias:


## Pruebas Funcionales:
Se realizaron test funcionales con la herramienta de Selenium para la validación del email Id, para lo cual se realizaron los siguientes tests.
        def test1(self): 
            email = "ebejarr@unsa.edu.pe"
            esperado = check(email)
            print("TEST 1: ", email)
            self.assertEqual(WebTester(email), esperado)
        def test2(self): 
            email = "ggdeebor@gmailcom"
            esperado = check(email)
            print("TEST 2: ", email)
            self.assertEqual(WebTester(email), esperado)
        def test3(self): 
            email = "ikikop@gmai.com"
            esperado = check(email)
            print("TEST 3: ", email)
            self.assertEqual(WebTester(email), esperado)
        def test4(self): 
            email = "@datagmail.com"
            esperado = check(email)
            print("TEST 4: ", email)
            self.assertEqual(WebTester(email), esperado)


## Pruebas de Seguridad:
Se realizaron las pruebas de seguridad usando OWASP ZAP y estos fueron los resultados obtenidos:

#### Escaneo Activo
![](Images/i2.jpeg)

#### Alertas
![](Images/i3.jpeg)

#### Spider (URLs)
![](Images/i4.jpeg)

#### Spider (Messages)
![](Images/i5.jpeg)

## Pruebas de Performance:




