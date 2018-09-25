Selenium with Docker images
---
Overview:
---
 
Repository provide configuration example of Selenium with docker images 

---
**What you need to do:**
1. Install docker (https://docs.docker.com/release-notes/docker-ce/#17031-ce-2017-03-27)
2. Install VNC Viewer (https://www.realvnc.com/en/connect/download/viewer/)
3. Navigate to the folder where **docker-compose.yml** file and execute from command line command: **docker-compose up**
4. Wait until all necessary images are downloaded  :)
5. From command line execude command: **docker ps -a**  (see created containers) 
6. Open VNC Viewer and add path to your container (VNC allow us to see what happen in our tests)
![dockerimagesvncexample](https://user-images.githubusercontent.com/26840848/45994599-0ae55400-c09d-11e8-9430-72f30765527b.jpg)
7. Don't forget to add some changes in your code see :
```java
       if (driver == null) {
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setBrowserName("firefox");
            capabilities.setPlatform(Platform.LINUX);
            try {
                driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
```
7. Run out tests : **mvn clean test**
8. Even with docker you can make screenshoots and added it in reporting (i.e see: 
![dockerimagesallureresults](https://user-images.githubusercontent.com/26840848/39099117-67de4f9e-467d-11e8-9f75-04155c2e0b58.jpg)

