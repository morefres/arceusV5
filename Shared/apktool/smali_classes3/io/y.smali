.class public final synthetic Lio/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyt/o;


# instance fields
.field public final synthetic a:Ldn/x;

.field public final synthetic b:Lcom/withpersona/sdk2/camera/b;

.field public final synthetic c:Leo/e;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;


# direct methods
.method public synthetic constructor <init>(Ldn/x;Lcom/withpersona/sdk2/camera/b;Leo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/y;->a:Ldn/x;

    iput-object p2, p0, Lio/y;->b:Lcom/withpersona/sdk2/camera/b;

    iput-object p3, p0, Lio/y;->c:Leo/e;

    iput-object p4, p0, Lio/y;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lio/y;->a:Ldn/x;

    iget-object v1, p0, Lio/y;->b:Lcom/withpersona/sdk2/camera/b;

    iget-object v2, p0, Lio/y;->c:Leo/e;

    iget-object v3, p0, Lio/y;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-object v4, p1

    check-cast v4, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    move-object v5, p2

    check-cast v5, Lym/y;

    move-object v6, p3

    check-cast v6, Landroid/content/Context;

    move-object v7, p4

    check-cast v7, Landroid/view/ViewGroup;

    invoke-static/range {v0 .. v7}, Lio/z;->b(Ldn/x;Lcom/withpersona/sdk2/camera/b;Leo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
