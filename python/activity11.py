fruit_shop = {
    "apple": 10,
    "banana": 20,
    "orange": 30,
    "grapes": 40
}
key_to_check = input("What are you looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")