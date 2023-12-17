package igincan.circleapi.entities.requests;

import igincan.circleapi.entities.Circle;
import igincan.circleapi.entities.Point;

public record IsInsideRequestBody(Circle circle, Point point) {}
