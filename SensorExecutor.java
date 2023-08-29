class SensorExecutor{
	
	public static void main(String automation[]){
		Sensor sensor = new Sensor();
		sensor.sensorId = 1;
		sensor.sensorType = "UltrasonicSensor";
		sensor.sensorBrand = "GreenRabbit";
		sensor.sensorMaterial = "Copper";
		sensor.sensorPrice = 157;
		
		System.out.println("SensorId is"+ sensor.sensorId);
		System.out.println("SensorType is"+ sensor.sensorType);
		System.out.println("SensorBrand is"+ sensor.sensorBrand);
		System.out.println("SensorMaterial"+ sensor.sensorMaterial);
		System.out.println("SensorPrice"+ sensor.sensorPrice);
		
		sensor.provideAutomation();
		
		Sensor sensor1 = new Sensor();
		sensor1.sensorId = 2;
		sensor1.sensorType = "VoltageSensor";
		sensor1.sensorBrand = "DS Robotics";
		sensor1.sensorMaterial = "Brass";
		sensor1.sensorPrice = 169;
		
		System.out.println("SensorId is"+ sensor1.sensorId);
		System.out.println("SensorType is"+ sensor1.sensorType);
		System.out.println("SensorBrand is"+ sensor1.sensorBrand);
		System.out.println("SensorMaterial"+ sensor1.sensorMaterial);
		System.out.println("SensorPrice"+ sensor1.sensorPrice);
		
		sensor1.provideAutomation();
		
		Sensor sensor2 = new Sensor();
		sensor2.sensorId = 3;
		sensor2.sensorType = "TemperatureSensor";
		sensor2.sensorBrand = "Electrobot";
		sensor2.sensorMaterial = "Epoxy";
		sensor2.sensorPrice = 259;
		
		System.out.println("SensorId is"+ sensor2.sensorId);
		System.out.println("SensorType is"+ sensor2.sensorType);
		System.out.println("SensorBrand is"+ sensor2.sensorBrand);
		System.out.println("SensorMaterial"+ sensor2.sensorMaterial);
		System.out.println("SensorPrice"+ sensor2.sensorPrice);
		
		sensor2.provideAutomation();
		
		Sensor sensor3 = new Sensor();
		sensor3.sensorId = 4;
		sensor3.sensorType = "PressureSensor";
		sensor3.sensorBrand = "Pardzworld";
		sensor3.sensorMaterial = "Plastic";
		sensor3.sensorPrice = 649;
		
		System.out.println("SensorId is"+ sensor3.sensorId);
		System.out.println("SensorType is"+ sensor3.sensorType);
		System.out.println("SensorBrand is"+ sensor3.sensorBrand);
		System.out.println("SensorMaterial"+ sensor3.sensorMaterial);
		System.out.println("SensorPrice"+ sensor3.sensorPrice);
		
		sensor3.provideAutomation();
		
		Sensor sensor4 = new Sensor();
		sensor4.sensorId = 5;
		sensor4.sensorType = "VibrationSensor";
		sensor4.sensorBrand = "Xcluma";
		sensor4.sensorMaterial = "Fiber Glass";
		sensor4.sensorPrice = 238;
		
		System.out.println("SensorId is"+ sensor4.sensorId);
		System.out.println("SensorType is"+ sensor4.sensorType);
		System.out.println("SensorBrand is"+ sensor4.sensorBrand);
		System.out.println("SensorMaterial"+ sensor4.sensorMaterial);
		System.out.println("SensorPrice"+ sensor4.sensorPrice);
		
		sensor4.provideAutomation();
		
	}
}