class BanckAccount:
    def __init__(self):
        self.account_balance = 0
    def make_deposit(self,amount):
        self.account_balance +=amount
    def withdraw(self,amount):
        if amount>self.account_balance-5:
            print("Insufficient funds")
        else:
            self.account_balance =self.account_balance-amount-5
    def display_account_info(self):
        print(self.account_balance)
    def interest_yeld(self):
        if self.account_balance>0:
            self.account_balance +=self.account_balance*.01
class User:
    def __init__(self,name,email,account):
        self.name=name
        self.email=email
        self.account=BanckAccount()
    def make_deposit(self,amount):
        self.account.make_deposit(amount) 
    def withdrow (self,amount):
        self.account.account_balance -=amount
    def display_user_balance(self):
        print(self.name +":"+self.account.account_balance)
odai= User
#odai.make_deposit(100)
odai.display_user_balance()