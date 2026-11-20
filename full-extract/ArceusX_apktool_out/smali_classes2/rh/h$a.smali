.class public Lrh/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lrh/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrh/i$a;

    invoke-direct {v0}, Lrh/i$a;-><init>()V

    invoke-virtual {v0}, Lrh/i$a;->a()Lrh/i;

    move-result-object v0

    sput-object v0, Lrh/h$a;->a:Lrh/i;

    return-void
.end method
