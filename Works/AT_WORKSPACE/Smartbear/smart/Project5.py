from selenium import webdriver  
import time  
from selenium.webdriver.common.keys import Keys  
print("test case started")  

driver = webdriver.Chrome("E:\eclipse\chromedriver_win32\chromedriver.exe")

driver.maximize_window()  

driver.delete_all_cookies()  

driver.get("https://www.myntra.com/")  
 
driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input").send_keys("liquid lipstick")
time.sleep(2)

driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/a/span").click()
time.sleep(2)

#driver.find_element_by_xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[2]/div/div[2]/section/ul/li[2]/a/div[1]/div").click()

driver.get("https://www.myntra.com/lipstick/maybelline/maybelline-new-york-super-stay-matte-ink-liquid-lip-color---20-pioneer-/2230636/buy")
driver.find_element_by_xpath("/html/body/div[2]/div/div/div/main/div[2]/div[2]/div[4]/div/div[1]").click()
driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/a[2]/span[3]").click()
#driver.find_element_by_xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[3]/a/div").click()
print("added to cart successfully")
driver.close()