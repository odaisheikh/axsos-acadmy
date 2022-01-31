class User:
    def __init__(self,name,email):
        self.name=name
        self.email=email
        self.balance=0
        self.athor_user_balance=0;
    def make_deposit(self,amount):
        self.balance +=amount; 
    def withdrow (self,amount):
        self.balance -=amount
    def display_user_balance(self):
        print(self.name +":"+self.balance )
    def transfer_mony(self,ather_user,amount):
        self.balance -=amount
        ather_user.make_deposit(amount)

odai = User("odai","odaior300210@gmail.com")
odai.make_deposit(100)
print(odai.balance)
odai.withdrow(50)
print(odai.balance)
mohammad = User("mohammad","moh_1999@student.com")
odai.transfer_mony(mohammad,30)
print(mohammad.balance)