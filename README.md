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



## Pruebas de Performance:



## Gestión de Issues: 


