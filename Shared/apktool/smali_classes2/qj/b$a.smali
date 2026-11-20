.class public Lqj/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lqj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqj/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqj/b;-><init>(Lqj/c;)V

    sput-object v0, Lqj/b$a;->a:Lqj/b;

    return-void
.end method
