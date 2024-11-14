FROM python:alpine

RUN pip install flask

WORKDIR /app
COPY app.py .
COPY templates/ templates/


CMD ["python", "app.py"]