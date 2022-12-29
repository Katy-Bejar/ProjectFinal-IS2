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



## Gestión de Issues: 


