import string
def alphabet_position (letter):
    letter = letter.lower()
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    
    return alphabet.index (letter)

def rotate_character(char, rot):
    
    letter=""
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
        
    if char.isalpha():
        encrypted = (alphabet_position(char) + rot) % 26

        if char in string.ascii_uppercase:
                letter = alphabet [encrypted].upper()
        else:
                letter = alphabet [encrypted]
        return letter       
    else:
        return char