/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ridhw
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CCI {
   
    private ComputerSystem[] computerSystems; // Using array to manage a fixed number of computer systems
    private int computerCount;
    
    
    private ArrayList<Devices> devices;// Using ArrayList to manage devices
    
   
    private Stack<Software> softwareStack; // Using Stack to manage software installations
    
   
    private Queue<ClientRequests> clientQueue; // Using Queue to manage customer requests
    
    public CCI(int numOfComputers) {
        computerSystems = new ComputerSystem[numOfComputers];
        devices = new ArrayList<>();
        softwareStack = new Stack<>();
        clientQueue = new LinkedList<>();
        computerCount = 0;
    }
    
    
    public void addComputerSystem(ComputerSystem system) {
        if (computerCount < computerSystems.length) {
            computerSystems[computerCount++] = system;
        } else {
            System.out.println("No more space to add a new computer system.");
        }
    }
    
    public void listComputerSystems() {
        for (int i = 0; i < computerCount; i++) {
            System.out.println(computerSystems[i]);
        }
    }
    

    public void addDevice(Devices device) {
        devices.add(device);
    }
    
    public void listDevices() {
        for (Devices device : devices) {
            System.out.println(device);
        }
    }
    
  
    public void installSoftware(Software software) {
        softwareStack.push(software);
    }
    
    public void uninstallSoftware() {
        if (!softwareStack.isEmpty()) {
            Software removed = softwareStack.pop();
            System.out.println("Uninstalled: " + removed);
        } else {
            System.out.println("No software to uninstall.");
        }
    }
    
   
    public void addclientRequest(ClientRequests request) {
        clientQueue.add(request);
    }
    
    public void processNextClientRequest() {
        if (!clientQueue.isEmpty()) {
            ClientRequests request = clientQueue.poll();
            System.out.println("Processing request: " + request);
        } else {
            System.out.println("No customer requests to process.");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        CCI inventory = new CCI(5);
           while (true) {
            System.out.println("1. Add Computer System");
            System.out.println("2. List Computer Systems");
            System.out.println("3. Add Device");
            System.out.println("4. List Devices");
            System.out.println("5. Install Software");
            System.out.println("6. Uninstall Software");
            System.out.println("7. Add Client Request");
            System.out.println("8. Process Next Client Request");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            
            
            int choice = input.nextInt();
            input.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter system name: ");
                    String sysName = input.nextLine();
                    System.out.print("Enter processor: ");
                    String processor = input.nextLine();
                    System.out.print("Enter RAM size: ");
                    int ram = input.nextInt();
                    input.nextLine(); 
                    inventory.addComputerSystem(new ComputerSystem(sysName, processor, ram));
                    break;
                case 2:
                    inventory.listComputerSystems();
                    break;
                case 3:
                    System.out.print("Enter Device type: ");
                    String type = input.nextLine();
                    System.out.print("Enter brand: ");
                    String brand = input.nextLine();
                    inventory.addDevice(new Devices(type, brand));
                    break;
                case 4:
                    inventory.listDevices();
                    break;
                case 5:
                    System.out.print("Enter software name: ");
                    String softwareName = input.nextLine();
                    inventory.installSoftware(new Software(softwareName));
                    break;
                case 6:
                    inventory.uninstallSoftware();
                    break;
                case 7:
                    System.out.print("Enter client name: ");
                    String customerName = input.nextLine();
                    System.out.print("Enter request type: ");
                    String requestType = input.nextLine();
                    inventory.addclientRequest(new ClientRequests(customerName, requestType));
                    break;
                case 8:
                    inventory.processNextClientRequest();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    
            }
        }

    }
}
