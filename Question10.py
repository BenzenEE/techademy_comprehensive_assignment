import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

@pytest.fixture
def driver():
    service = Service(ChromeDriverManager().install())
    driver = webdriver.Chrome(service=service)
    
    driver.maximize_window()
    yield driver  
    
    driver.quit()  

def test_w3schools_logo(driver):
    driver.get("https://www.w3schools.com")
    logo = driver.find_element(By.XPATH, "//*[@id='w3-logo']/i")
    assert logo.is_displayed(), "W3Schools logo is not visible on the page!"
