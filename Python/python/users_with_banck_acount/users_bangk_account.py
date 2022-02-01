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
    def __init__(self,name,email):
        self.name=name
        self.email=email
        self.account=[BanckAccount()]
    def add_new_account(self):
        self.account.append(BanckAccount())
    def make_deposit(self,amount,account_num):
        self.account[account_num].make_deposit(amount) 
    def withdrow (self,amount,account_num):
        self.account[account_num].account_balance -=amount
    def display_user_info(self,account_num):
        print(self.name ," your balance account is : ",self.account[account_num].account_balance )
odai= User("odai","odaior300210@gmail.com")
odai.add_new_account()
odai.make_deposit(1000,1)
odai.account[1].interest_yeld()
odai.withdrow(50,1)
print(odai.account[1].account_balance)
