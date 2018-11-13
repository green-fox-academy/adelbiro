package fleetofthings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing milk = new Thing("Get milk");
        Thing obstaclesRemoval = new Thing("Remove the obstacles");
        Thing standingUP = new Thing("Stand up");
        Thing lunchEating = new Thing("Eat lunch");

        standingUP.complete();
        lunchEating.complete();

        fleet.add(milk);
        fleet.add(obstaclesRemoval);
        fleet.add(standingUP);
        fleet.add(lunchEating);
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}