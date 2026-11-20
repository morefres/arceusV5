.class public Lhj/u$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lhj/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhj/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhj/u;-><init>(Lhj/v;)V

    sput-object v0, Lhj/u$b;->a:Lhj/u;

    return-void
.end method

.method public static bridge synthetic a()Lhj/u;
    .locals 1

    sget-object v0, Lhj/u$b;->a:Lhj/u;

    return-object v0
.end method
