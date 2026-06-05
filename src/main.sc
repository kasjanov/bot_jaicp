require: slotfilling/slotFilling.sc
  module = sys.zb-common

theme: /

    state: /hello
        intent!: /hello
        a: Привет! 👋 Я бот-помощник. Я могу рассказать о погоде 🌤 и курсах валют 💱. Просто спросите!

    state: /weather
        intent!: /weather
        a: Сегодня переменная облачность, температура около +18°C, ветер слабый. 🌤 Хорошего дня!

    state: /currency
        intent!: /currency
        a: Текущий курс валют 💱:
        a: 💵 1 USD ≈ 90 ₽
        a: 💶 1 EUR ≈ 98 ₽

    state: /NoMatch
        event!: noMatch
        a: Извините, я вас не понял. 🤔 Я умею рассказывать о погоде 🌤 и курсах валют 💱. Попробуйте спросить иначе.