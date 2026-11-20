.class public final Lpp/m1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpp/m1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lpp/m1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpp/m1;

    invoke-direct {v0}, Lpp/m1;-><init>()V

    sput-object v0, Lpp/m1$a;->a:Lpp/m1;

    return-void
.end method
