if __name__ == "__main__":
    print("Dime un número")
    A = int(input())
    B = int(input())
    C = int(input())
    if A > B:
        if A > C:
            if B > C:
                print(f"El orden de números de mayor a menor es: {A}, {B}, {C}")
            else:
                print(f"El orden de los números de mayor a menor es: {A},{C}, {B}")
        elif C > B:
            print(f"El orden de los números de mayor a menor es: {C}, {B}, {A}")
        #else:
        
