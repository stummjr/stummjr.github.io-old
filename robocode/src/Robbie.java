package vsj;
import robocode.*;


public class Robbie extends Robot
{

	public void run()
	{
		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e)
	{
		fire(1);
	}


	public void onHitByBullet(HitByBulletEvent e)
	{
		turnLeft(90 - e.getBearing());
	}

}
