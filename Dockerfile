FROM openjdk:11-jdk

RUN apt-get update \
  && apt-get install -y wget

RUN mkdir /opt/gradle

RUN wget -O /opt/gradle/gradle-bin.zip https://services.gradle.org/distributions/gradle-5.6.2-bin.zip

RUN unzip -d /opt/gradle /opt/gradle/gradle-bin.zip

ENV PATH="${PATH}:/opt/gradle/gradle-5.6.2/bin"

CMD [ "sh" ]
