from selenium import webdriver  
import time  
from selenium.webdriver.common.keys import Keys  
print("test case started")  
  
driver = webdriver.Chrome("E:\eclipse\chromedriver_win32\chromedriver.exe")

driver.maximize_window()  

driver.delete_all_cookies()  

driver.get("https://www.flipkart.com/")  
 
driver.find_element_by_xpath("/html/body/div[2]/div/div/button").click()
driver.find_element_by_name("q").send_keys("skull candy headset")  
time.sleep(2)

driver.find_element_by_xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/button").click()
time.sleep(2)  

driver.get("https://www.flipkart.com/skullcandy-s2dul-j335-wired-headset/p/itm9b49219b966f0?pid=ACCEJNYC39RUVAHE&lid=LSTACCEJNYC39RUVAHEJBHVSA&marketplace=FLIPKART&q=skull+candy+headset&store=0pm%2Ffcn&srno=s_1_1&otracker=search&otracker1=search&fm=SEARCH&iid=65ef1a38-20c8-4b0e-ab36-b77b19e3ad40.ACCEJNYC39RUVAHE.SEARCH&ppt=hp&ppn=homepage&ssid=nvf5p2n96o0000001637809431901&qH=f70871a528940a5e")


driver.find_element_by_xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button").click()
time.sleep(2)

driver.find_element_by_xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[5]/div/div/a").click()
time.sleep(2)

#driver.find_element_by_xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button").click()
#time.sleep(2)

print("successfully added to cart")

driver.close()  