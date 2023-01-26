FROM gradle:jdk15

RUN mkdir /project

COPY --chown=gradle:gradle src /project/src
COPY --chown=gradle:gradle settings.gradle /project/
COPY --chown=gradle:gradle build.gradle /project/

WORKDIR /project

RUN gradle compileJava --no-daemon
ENTRYPOINT gradle test --no-daemon