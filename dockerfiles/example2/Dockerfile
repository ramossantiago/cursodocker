FROM ubuntu

RUN useradd userapp --no-create-home --no-user-group
RUN mkdir app

WORKDIR /app

USER userapp

COPY start.sh .
COPY start2.sh .

# shell form
#CMD /app/start.sh

# exec form
#CMD ["/app/start.sh"]

#ENTRYPOINT ["/app/start.sh"]

ENTRYPOINT ["sh","-c"]
CMD ["/app/start.sh"]


#ENTRYPOINT ["java","-jar"]
#CMD ["app1.jar"]