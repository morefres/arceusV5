.class public final Lxn/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxn/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lxn/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxn/h;

    invoke-direct {v0}, Lxn/h;-><init>()V

    sput-object v0, Lxn/h$a;->a:Lxn/h;

    return-void
.end method
