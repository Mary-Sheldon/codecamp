from helpers import alphabet_position, rotate_character
   
def encrypt(text, rot):
    message = ''
    for char in text:
        char = rotate_character(char, rot)
        message += char
    return message
       
    
def main():
    text = input ('what is your secret message?')
    rot = int(input('how many letters off?'))
    print (encrypt(text, rot))

if __name__ == "__main__":
    main()