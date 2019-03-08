package Guleri;
    public class FlourPacker {
     
        public static boolean canPack(int bigCount, int smallCount, int goal) {
     
            if (bigCount<0 || smallCount<0 || goal<0) {
                return false;
            }
     
            int total = bigCount*5+smallCount;
     
            if (total<goal) {
                System.out.println("Not enough bags to make a package.");
     
            }
     
            else {
                int usedBigCount = (goal/5);
                if (usedBigCount*5+smallCount>=goal) {
                    return true;
                }
            }
            
            return false;
        }
    }
