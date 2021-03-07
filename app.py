from chatterbot import ChatBot
from flask import Flask, render_template, request
from chatterbot.trainers import ChatterBotCorpusTrainer

# chatbot=ChatBot("Ellie",storage_adapter="chatterbot.storage.MongoDatabaseAdapter")
chatbot = ChatBot('Ellie')
trainer = ChatterBotCorpusTrainer(chatbot)
trainer.train("chatterbot.corpus.english")

app = Flask(__name__)
app.static_folder = 'static'

@app.route("/")
def home():
    return render_template("index.html")

@app.route("/get")
def get_bot_response():
    userText = request.args.get('msg')
    return str(chatbot.get_response(userText))

if __name__ == "__main__":
    app.run()
