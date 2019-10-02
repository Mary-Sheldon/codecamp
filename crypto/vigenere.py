from helpers import alphabet_position, rotate_character
   
def encrypt(text, keyword):
    message = ""
    index = 0
    for char in text:
        if char.isalpha():
            rot = alphabet_position(keyword[index % len(keyword)])
            message += rotate_character (char, rot)
            index +=1
        else:
            message = message + char
    return message


    
def main():
    text = input('what is your secret message?')
    keyword = input('Encryption key?')
    print (encrypt(text, keyword))

if __name__ == "__main__":
    main()

      