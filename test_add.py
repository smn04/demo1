from add import addd
def test_addd():
    assert addd(5,1) == 6
    print("Adding 5 and 1 =",addd(5,1))
    assert addd(3,4) == 7

test_addd()

